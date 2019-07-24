package wang.dreamland.www.activemq;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class SendMessage {
	private static String accessKeyId = "LTAIRnpi7WkA9L2N";//你的accessKeyId,参考本文档步骤2
	private static String accessKeySecret = "4QvhHRf04dHXY8IlgPw6lFcbZGJt7E";//你的accessKeySecret，参考本文档步骤2
	private static String setSignName = "梦境网";
	private static String dayutemplateCode = "SMS_171114530";

	public static void sendMessages(String code,String phone){
		//设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "1000000");
		System.setProperty("sun.net.client.defaultReadTimeout", "1000000");
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
		IAcsClient client = new DefaultAcsClient(profile);

		CommonRequest request = new CommonRequest();
		request.setMethod(MethodType.POST);
		request.setDomain("dysmsapi.aliyuncs.com");
		request.setVersion("2017-05-25");
		request.setAction("SendSms");
		request.putQueryParameter("RegionId", "cn-hangzhou");
		request.putQueryParameter("PhoneNumbers", phone);
		request.putQueryParameter("SignName", setSignName);
		request.putQueryParameter("TemplateCode", dayutemplateCode);
		request.putQueryParameter("TemplateParam", "{\"code\":\"" + code + "\"}");
		try {
			CommonResponse response = client.getCommonResponse(request);

			System.out.println(response.getData());
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		}
	}
}
