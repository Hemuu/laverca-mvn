/* ==========================================
 * Laverca Project
 * https://sourceforge.net/projects/laverca/
 * ==========================================
 * Copyright 2017 Laverca Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.laverca.examples.swisscom;

import java.io.IOException;

import org.apache.axis.AxisFault;

import fi.laverca.MSS_Formats;
import fi.laverca.ProgressUpdate;
import fi.laverca.SignatureProfiles;
import fi.laverca.examples.ExampleConf;
import fi.laverca.swisscom.SwisscomClient;
import fi.laverca.swisscom.SwisscomRequest;
import fi.laverca.swisscom.SwisscomResponse;
import fi.laverca.swisscom.SwisscomResponseHandler;
import fi.laverca.util.DTBS;
import fi.laverca.util.JvmSsl;


/**
 * Simple Swisscom signature request example
 * 
 * <ul>
 * <li>Uses SwisscomClient
 * <li>Sends a SignatureRequest with DTBS "sign this"
 * <li>Uses asynch-client-server messaging mode
 * <li>No AdditionalServices
 * </ul>
 *
 */
public class Sign {
    
    /**
     * The main method
     * @param args
     */
    public static void main(final String[] args) {
       
        String msisdn = "+35847001001";
        if (args.length > 0) {
            msisdn = args[0];
        }
        
        // Load config
        ExampleConf conf = ExampleConf.getInstance();
        
        // Setup SSL
        System.out.println("Setting up ssl");
        JvmSsl.setSSL(conf.getTruststore(),
                      conf.getTruststorePwd(),
                      conf.getTruststoreType(),
                      conf.getKeystore(),
                      conf.getKeystorePwd(),
                      conf.getKeystoreType());

        // Create client
        SwisscomClient client = new SwisscomClient(conf.getApId(), 
                                                   conf.getApPwd(), 
                                                   conf.getSignatureUrl(), 
                                                   conf.getStatusUrl(), 
                                                   conf.getReceiptUrl());

        
        // Create DataToBeSigned
        DTBS        dtbs = new DTBS("sign this", DTBS.ENCODING_UTF8);
        String apTransId = "A" + System.currentTimeMillis();
      
        SwisscomRequest req = client.createRequest(apTransId, // AP Transaction ID
                                                   dtbs,      // Data to be signed
                                                   msisdn,    // MSISDN
                                                   null,      // UserLang AdditionalService
                                                   null,      // AdditionalServices                
                                                   SignatureProfiles.SWISSCOM_AUTHENTICATION, // Signature profile
                                                   MSS_Formats.PKCS7);                        // MSS Format
                                                                            
        // Initialize response handler
        SwisscomResponseHandler handler = new SwisscomResponseHandler() {
            
            @Override
            public void onResponse(final SwisscomRequest req, final SwisscomResponse resp) {
                System.out.println("Got a response");
                System.out.println("  StatusCode   : " + resp.getStatusCode());
                System.out.println("  StatusMessage: " + resp.getStatusMessage());
            }

            @Override
            public void onError(final SwisscomRequest req, final Throwable t) {
                System.out.println("Got an error:");
                t.printStackTrace();
            }

            @Override
            public void onOutstandingProgress(final SwisscomRequest req, final ProgressUpdate prgUpdate) {
                System.out.println("Got a progress update");
            }
        };
        
        try {
            client.call(req, handler);
        } catch(AxisFault af) {
            System.out.println("Got a SOAP fault:");
            af.printStackTrace();
        } catch(IOException ioe) {
            System.out.println("Got an IOException:");
            ioe.printStackTrace();
        }
    }

}