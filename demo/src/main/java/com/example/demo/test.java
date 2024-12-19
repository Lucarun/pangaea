package com.example.demo;

/**
 * User: luca
 * Date: 2024/12/11
 * Description:
 */
public AntCloudRestClientResponse execute(AntCloudRestClientRequest request){
        apiUrl=this.getCorrectUrl(this.getEndpoint(),request.getUrlPath());
        responseString=AntCloudWebUtils.doRestRequest(apiUrl,request.getHttpMethod(),request.getHeaders(),request.getQueryParams(),request.getPostBody(),this.httpClient.getHttpConfig().getConnectionTimeoutMillis(),this.httpClient.getHttpConfig().getReadTimeoutMillis(),(Proxy)null);
        JSONObject wholeJson=JSON.parseObject(responseString);
        if(wholeJson==null){
            logger.error(responseString);
            throw new ClientException("TRANSPORT_ERROR","Unexpected gateway response: "+responseString);
        }else{
            JSONObject responseNode=wholeJson.getJSONObject("response");
            if(responseNode==null){
                logger.error(responseString);
                throw new ClientException("TRANSPORT_ERROR","Unexpected gateway response: "+responseString);
            }else{

            }
        }

}

        }
