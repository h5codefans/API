﻿$(function(){
    
	$('#edit').menubutton({
	     menu:'#box',
		 iconCls:'icon-edit',
		 plain:false,
		 duration:500,
		 //disabled:true,
	});
	
	//console.log($('#edit').menubutton('options'));
	$('#edit').menubutton('disable');
	$('#edit').menubutton('enable');
	//$('#edit').menubutton('destroy');
});