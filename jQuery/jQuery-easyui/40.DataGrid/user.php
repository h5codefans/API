<?php
	//sleep(3);
	require 'config.php';
	
	$page = $_POST['page'];
	$pageSize = $_POST['rows'];
    $first = $pageSize * ($page - 1);
	
	$order=$_POST['order'];
    $sort=$_POST['sort'];	
	
	$sql='';
	$user='';
	$date_from='';
	$date_to='';
	
	if(isset($_POST['user'])&&!empty($_POST['user'])){
	      $user="user LIKE '%{$_POST['user']}%' AND ";
		  $sql.=$user;
	}
	
	if(isset($_POST['date_from'])&&!empty($_POST['date_from'])){
	      $date_from="date>='{$_POST['date_from']}' AND ";
		  $sql.=$date_from;
	}
	
	if(isset($_POST['date_to'])&&!empty($_POST['date_to'])){
	      $date_to="date<='{$_POST['date_to']}' AND ";
		  $sql.=$date_to;
	}
	
	if(!empty($sql)){
	   $sql='WHERE '.substr($sql,0,-4);
	}
	
	$query = mysql_query("SELECT id,user,email,date FROM user $sql ORDER BY $sort $order LIMIT $first,$pageSize") or die('SQL 错误！');
	$total=mysql_num_rows(mysql_query("SELECT id,user,email,date FROM user $sql"));
	
	$json='';
	while (!!$row = mysql_fetch_array($query, MYSQL_ASSOC)) {
		$json.=json_encode($row).',';
	}
	
	
	$json=substr($json,0,-1);
	echo '{"total":'.$total.',"rows":['.$json.'],"footer":[{"user":"统计","email":"统计","date":"统计"}]}';

	
	mysql_close();
?>