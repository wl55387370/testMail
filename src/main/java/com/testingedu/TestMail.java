package com.testingedu;

public class TestMail {

	public static void main(String[] args) throws Exception {
		
		SendMail mail=new SendMail();
        mail.send("<html>\r\n" + 
        		"<head>\r\n" + 
        		"<meta charset=\"utf-8\">\r\n" + 
        		"<base target=\"_blank\">\r\n" + 
        		"<style type=\"text/css\">\r\n" + 
        		"::-webkit-scrollbar{ display: none; }\r\n" + 
        		"</style>\r\n" + 
        		"<style id=\"cloudAttachStyle\" type=\"text/css\">\r\n" + 
        		"#divNeteaseBigAttach, #divNeteaseBigAttach_bak{display:none;}\r\n" + 
        		"</style>\r\n" + 
        		"\r\n" + 
        		"</head>\r\n" + 
        		"<body tabindex=\"0\" role=\"listitem\">\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"    \r\n" + 
        		"    <style type=\"text/css\">\r\n" + 
        		"body{ background:#ffffff; margin:0 auto; padding:0; text-align:left; font-size:12px; font-family: \"微软雅黑\",\"宋体\";}\r\n" + 
        		"table{ font-size:12px; font-family: \"微软雅黑\",\"宋体\";}\r\n" + 
        		".table_c{border:1px solid #ccc;border-collapse:collapse; }\r\n" + 
        		".table_c td{border:1px solid #ccc; border-collapse:collapse;}\r\n" + 
        		".table_b{border:1px solid #666;border-collapse:collapse; }\r\n" + 
        		".table_b td{ border-collapse:collapse; border:1px solid #ccc;}\r\n" + 
        		".table_b th{color:#fff; background:#666;}\r\n" + 
        		"a:link{ color:#3366cc; font-weight:normal; }\r\n" + 
        		"a:visited { color: #3366cc;}\r\n" + 
        		"a:hover{ color:#000; }\r\n" + 
        		"a:active { color:#3366cc; }\r\n" + 
        		"td{ line-height:20px;}\r\n" + 
        		" </style>\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"    <table width=\"650\" border=\"0\" cellspacing=\"0\" align=\"center\" cellpadding=\"0\" style=\"border: #ccc 1px solid;\">\r\n" + 
        		"        <tbody><tr>\r\n" + 
        		"            <td>\r\n" + 
        		"                <table width=\"650\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"fbfbfb\" style=\"border-bottom: #eeeeee 1px solid;border-top: #cc0000 1px solid;\">\r\n" + 
        		"                    \r\n" + 
        		"                    <tbody><tr>\r\n" + 
        		"                        <td width=\"137\">\r\n" + 
        		"                            <img src=\"lib/物必达1.png\" alt=\"物必达\" width=\"250\" height=\"40\"></td>\r\n" + 
        		"                        <td width=\"249\" align=\"left\" style=\"font-size: 12px; color: #666666; padding-top: 26px;\">\r\n" + 
        		"                            此信为测试邮件，请不要直接回复。</td>\r\n" + 
        		"                        <td width=\"264\" align=\"right\" style=\"font-size: 12px; font-weight: bold; color: #999999;\r\n" + 
        		"                            padding-top: 26px;\">\r\n" + 
        		"                                                     <a href=\"http://www.qishixingqiu.com/\" target=\"_blank\">\r\n" + 
        		"                                       <strong><font color=\"ff6600\">重庆物必达网络科技有限公司</font></strong></a></td>\r\n" + 
        		"                    </tr>\r\n" + 
        		"                </tbody></table>\r\n" + 
        		"                <table width=\"592\" border=\"0\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\" style=\"margin: 28px 28px 10px 28px;\">\r\n" + 
        		"                    <tbody><tr>\r\n" + 
        		"                        <td style=\"font-size: 13px; color: #666666; padding-bottom: 10px;\">\r\n" + 
        		"                            各位同事见信好:\r\n" + 
        		"                          </td>\r\n" + 
        		"                    </tr>\r\n" + 
        		"                </tbody></table>\r\n" + 
        		"               	<table width=\"592\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n" + 
        		"                  <tbody><tr>\r\n" + 
        		"                    <td style=\"font-size: 14px; color: 333333; font-weight: bold; padding-bottom:15px;\">租车<font color=\"ff6600\"></font>小程序测试！</td>\r\n" + 
        		"                  </tr>\r\n" + 
        		"                  <tr>\r\n" + 
        		"				                    <td><table width=\"592\" border=\"0\" align=\"center\" class=\"table_c\" style=\"border-collapse:collapse;\">\r\n" + 
        		"                      <tbody><tr>\r\n" + 
        		"                          <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"#FFFFFF\" style=\"border:1px solid #ccc;\">项目</td>\r\n" + 
        		"                        <td width=\"80\" height=\"28\" align=\"center\" bgcolor=\"#FFFFFF\" style=\"border:1px solid #ccc;\"> xxx项目测试</td>\r\n" + 
        		"                        <td width=\"80\" align=\"center\" bgcolor=\"#FFFFFF\" style=\"border:1px solid #ccc;\">测试时间</td>\r\n" + 
        		" <td width=\"80\" align=\"center\" bgcolor=\"#FFFFFF\" style=\"border:1px solid #ccc;\" id=\"test_time\">2018-11-15</td>\r\n" + 
        		"                      </tr>\r\n" + 
        		"				                      <tr>\r\n" + 
        		"                        <td height=\"28\" bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\">测试状态</td>\r\n" + 
        		"                        <td height=\"28\" bgcolor=\"green\" align=\"center\" style=\"border:1px solid #ccc;\">PASS</td>\r\n" + 
        		"                        <td bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\">通过率</td>\r\n" + 
        		"                        <td bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\"><!--<a href=\"\">-->100%</a>\r\n" + 
        		"</td>\r\n" + 
        		"                      </tr>	\r\n" + 
        		"		                      <tr>\r\n" + 
        		"                        <td height=\"28\" bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\">测试用例数</td>\r\n" + 
        		"                        <td height=\"28\" bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\">50</td>\r\n" + 
        		"                        <td bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\">执行用例</td>\r\n" + 
        		"                        <td bgcolor=\"#FFFFFF\" align=\"center\" style=\"border:1px solid #ccc;\"><!--<a href=\"\">-->40</a>\r\n" + 
        		"</td>\r\n" + 
        		"                      </tr>						  \r\n" + 
        		"                    </tbody></table></td>\r\n" + 
        		"                  </tr>\r\n" + 
        		"                  \r\n" + 
        		"                 \r\n" + 
        		"<tr><td>&nbsp;</td></tr>\r\n" + 
        		"<tr>\r\n" + 
        		"                  		<td><a target=\"_blank\" href=\"http://www.net.cn/hosting/lightcloud/?&amp;msctype=email&amp;mscareaid=cn&amp;mscsiteid=cn&amp;mscmsgid=4640118031700181504&amp;\"></a></td>\r\n" + 
        		"                  </tr>\r\n" + 
        		"                                  </tbody></table>\r\n" + 
        		"                <table width=\"592\" border=\"0\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\" style=\"margin: 34px 28px 16px 28px; border-top: #e4e4e4 1px solid;\">\r\n" + 
        		"                    <tbody><tr>\r\n" + 
        		"                        <td style=\"font-size: 12px; line-height: 20px; color: #999999; padding-top: 6px;\">\r\n" + 
        		"                            如对测试邮件有任何疑问，请联系QQ <a href=\"https://web2.qq.com/\" target=\"_blank\"><font color=\"#666666\">286075568</font></a> 反馈。<br>\r\n" + 
        		"                           <!-- 如果在使用过程中遇到问题，您可以选择以下两种方式解决：<br>\r\n" + 
        		"                            1、进入<a href=\"http://help.aliyun.com/?&amp;msctype=email&amp;mscareaid=cn&amp;mscsiteid=cn&amp;mscmsgid=4640118031700181504&amp;utm_campaign=sys&amp;utm_medium=edm&amp;utm_source=foot\" target=\"_blank\"><font color=\"#666666\">帮助中心</font></a>查看相关帮助信息；<br>\r\n" + 
        		"                            2、点击<a href=\"https://workorder.console.aliyun.com/console.htm#/ticket/createIndex?&amp;msctype=email&amp;mscareaid=cn&amp;mscsiteid=cn&amp;mscmsgid=4640118031700181504&amp;utm_campaign=sys&amp;utm_medium=edm&amp;utm_source=foot\" target=\"_blank\"><font color=\"#666666\">提交工单</font></a>反馈问题，我们将在一个工作日内回复，您可以通过邮件或登录会员中心查看；<br>\r\n" + 
        		"                            本邮件内容仅供参考，业务详情如有变动，请以<a href=\"http://www.aliyun.com/?&amp;msctype=email&amp;mscareaid=cn&amp;mscsiteid=cn&amp;mscmsgid=4640118031700181504&amp;utm_campaign=sys&amp;utm_medium=edm&amp;utm_source=foot\" target=\"_blank\"><font color=\"#666666\">阿里云网站</font></a>公示为准。</td>-->\r\n" + 
        		"                    </tr>\r\n" + 
        		"                </tbody></table>\r\n" + 
        		"            </td>\r\n" + 
        		"        </tr>\r\n" + 
        		"    </tbody></table>\r\n" +  
        		" \r\n" + 
        		"\r\n" + 
        		"<style type=\"text/css\">\r\n" + 
        		"body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}\r\n" + 
        		"td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}\r\n" + 
        		"pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}\r\n" + 
        		"th,td{font-family:arial,verdana,sans-serif;line-height:1.666}\r\n" + 
        		"img{ border:0}\r\n" + 
        		"header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}\r\n" + 
        		"blockquote{margin-right:0px}\r\n" + 
        		"</style>\r\n" + 
        		"<script>\r\n" + 
        		"let t=document.getElementById('test_time')\r\n" + 
        		"var date = new Date();\r\n" + 
        		"var year = date.getFullYear();\r\n" + 
        		"var month = date.getMonth()+1;\r\n" + 
        		"var day = date.getDate();\r\n" + 
        		"var time = year+\"-\"+month+\"-\"+day;\r\n" + 
        		"t.innerHTML=time\r\n" + 
        		"</script>\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"<style id=\"ntes_link_color\" type=\"text/css\">a,td a{color:#064977}</style>\r\n" + 
        		"\r\n" + 
        		"</body></html>");
      

}}
