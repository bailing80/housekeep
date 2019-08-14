$(document).ready(function() {
	// 初始化就查询数据
	commit();
});

 function commit(){
    var order_mem=$("#order_mem").val();   //商户姓名
    var order_no = $("#out_trade_no").val(); //商户订单号
	var order_time = $("#s").val();   //订单时间
	var saler_id = $("#out_trade_no").val(); //直销商id
	var pay_type = $("#pay_away").val();//订单状态
    var pay_money =parseFloat($("#total_amount").val()); //付款金额
//    var num = GetRandomNum(1,1000); 
    
//    var order_member=order_no+num+"13944525950";//订单号拼写
    
    
	var obj = new Object();
	
	obj.order_no = order_no;
	obj.order_time = order_time;
	obj.saler_id = saler_id;
	obj.pay_type = pay_type;
	obj.pay_money = pay_money;
	obj.orde_state = "01";
	
	$.ajax({
		url :getRootPath()+"/Alipay_Controller/add_alipay_controller.action",
		data : obj,
		success : abc
	});
}
    function abc(id){
    	var obj = new Object();
    	obj.id = id;
    	
    	$.ajax({
    		url :getRootPath()+"/Alipay_Controller/query_order_member_By_Id.action",
    		data : obj,
    		success : ddd
    	});
    
    }

    function ddd(data){
    	var d = $(data);
    	$("#order_no").val(d.order_no);
    	//alert(d.order_no)
    }
    
    
    