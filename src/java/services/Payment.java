//package services;
//
//import com.fc.sdk.APIContext;
//import com.fc.sdk.APIRequest;
//import com.fc.sdk.APIResponse;
//import com.fc.sdk.APIMethodType;
//import java.util.Map;
//
//public class Payment
//{
//
//    public static void main(String[] args)
//    {
//        // Create API Context
//        APIContext context = new APIContext();
//        // Set API key that can be found in the user profile section
//        context.setApiKey("y7lieivsmf8i7qu7ffg9zhzuhqkemwfs");
//        // Set Public key that can be found in the user profile section
//        context.setPublicKey("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAmptSWqV7cGUUJJhUBxsMLonux24u+FoTlrb+4Kgc6092JIszmI1QUoMohaDDXSVueXx6IXwYGsjjWY32HGXj1iQhkALXfObJ4DqXn5h6E8y5/xQYNAyd5bpN5Z8r892B6toGzZQVB7qtebH4apDjmvTi5FGZVjVYxalyyQkj4uQbbRQjgCkubSi45Xl4CGtLqZztsKssWz3mcKncgTnq3DHGYYEYiKq0xIj100LGbnvNz20Sgqmw/cH+Bua4GJsWYLEqf/h/yiMgiBbxFxsnwZl0im5vXDlwKPw+QnO2fscDhxZFAwV06bgG0oEoWm9FnjMsfvwm0rUNYFlZ+TOtCEhmhtFp+Tsx9jPCuOd5h2emGdSKD8A6jtwhNa7oQ8RtLEEqwAn44orENa1ibOkxMiiiFpmmJkwgZPOG/zMCjXIrrhDWTDUOZaPx/lEQoInJoE2i43VN/HTGCCw8dKQAwg0jsEXau5ixD0GUothqvuX3B9taoeoFAIvUPEq35YulprMM7ThdKodSHvhnwKG82dCsodRwY428kg2xM/UjiTENog4B6zzZfPhMxFlOSFX4MnrqkAS+8Jamhy1GgoHkEMrsT5+/ofjCx0HjKbT5NuA2V/lmzgJLl3jIERadLzuTYnKGWxVJcGLkWXlEPYLbiaKzbJb2sYxt+Kt5OxQqC1MCAwEAAQ==");
//        // Set SSL true or false
//        context.setSsl(false);
//        // Set the method type of the HTTP Request (GET, POST, PUT)
//        context.setMethodType(APIMethodType.POST);
//        // Set the address of the API Server
//        context.setAddress("api.sandbox.vm.co.mz");
//        // Set the TCP port of the API Server
//        context.setPort(18352);
//        // Set path for the API
//        context.setPath("/ipg/v1x/c2bPayment/singleStage/");
//
//        // Add Header
//        context.addHeader("Origin", "developer.mpesa.vm.co.mz");
//
//        // Set parameters used for the API
//        context.addParameter("input_TransactionReference", "T12344C");
//        context.addParameter("input_CustomerMSISDN", "848131298");
//        context.addParameter("input_Amount", "10");
//        context.addParameter("input_ThirdPartyReference", "fd7201ca-0506-4cb0-97be-cd28a9e16aee");
//        context.addParameter("input_ServiceProviderCode", "171717");
//
//        // Create API request and execute it.
//        APIRequest request = new APIRequest(context);
//        APIResponse response = request.execute();
//
//        // Print results to the console
//        if (response != null)
//        {
//            System.out.println(response.getStatusCode() + " - " + response.getReason());
//            System.out.println(response.getResult());
//
//            for (Map.Entry<String, String> entry : response.getParameters().entrySet())
//            {
//                System.out.println(entry.getKey() + ":" + response.getParameter(entry.getKey()));
//            }
//        }
//    }
//}
