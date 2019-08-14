<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>支付宝电脑网站支付</title>

<form name=alipayment action=<%=baseurl%>/BaseMultiController/toPage.action?page=main/try/alipay.trade.page.pay method=post
			target="_blank">
			
			<dl>
					<dt>账号userAlipayCode ：</dt>
					<dd>
						<input  id="userAlipayCode" name="userAlipayCode" />
						
					</dd>
					<br>
					<dt>转账人姓名payerShowName ：</dt>
					<dd>
						<input id="payerShowName" name="payerShowName" />
					</dd>
						<br>
					<dt>备注remark ：</dt>
					<dd>
						<input id="remark" name="remark" />
					</dd>
						<br>
					<dt>金额amount：</dt>
					<dd>
						<input id="amount" name="amount" />
					</dd>
					<br>
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">付 款</button>
						</span> <span class="note-help">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span>
						
					</dd>
				</dl>
</form>

<script language="javascript">

function GetDateNow() {
	document.getElementById("userAlipayCode").value = "13944525950";
	document.getElementById("payerShowName").value = "测试";
	document.getElementById("remark").value = "aaa";
	document.getElementById("amount").value = "0.01";
}
GetDateNow();
</script>
