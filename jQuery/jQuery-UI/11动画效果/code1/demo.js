﻿$(function(){

   /*
  $('.show').click(function(){
      $('#box').show();
  });
  
   $('.hide').click(function(){
      $('#box').hide();
  });
  
  /可以传递两个参数，一个是数组，第二个是回调函数
  $('.show').click(function(){
      $('#box').show(1000);
  });
  
   $('.hide').click(function(){
      $('#box').hide(1000);
  });
  
    //slow,normal,fast,默认是400毫秒
   $('.show').click(function(){
      $('#box').show('slow');
  });
  
   $('.hide').click(function(){
      $('#box').hide('normal');
  });
  
    //回调函数
	 $('.show').click(function(){
      $('#box').show('slow',function(){
	      alert('显示完毕');
	  });
  });
  
   $('.hide').click(function(){
      $('#box').hide('normal');
  });
  
  //同步动画，四个区块同时显示
   $('.show').click(function(){
         $('.test').show('slow');
   });
   
   //列队动画
   $('.show').click(function(){
         $('.test').eq(0).show('fast',function(){
		     $('.test').eq(1).show('fast',function(){
			    $('.test').eq(2).show('fast',function(){
				     $('.test').eq(3).show('fast');
				});
			 });
		 });
		  
   });
   
   	//列队动画,递归自调用
	$('.show').click(function(){
	    $('.test').first().show('fast',function testShow(){
		      $(this).next().show('fast',testShow);
		});
	});
	
  $('.hide').click(function(){
	    $('.test').last().hide('fast',function testShow(){
		      $(this).prev().hide('fast',testShow);
		});
	});
});

 //切换
    $('.toggle').click(function(){
	      $('#box').toggle('slow');
	});
	
	$('.up').click(function(){
      $('#box').slideUp('slow');
  });
  
	$('.down').click(function(){
      $('#box').slideDown('slow');
  });

   $('.toggle').click(function(){
      $('#box').slideToggle('slow');
  });
  */
  
   $('.out').click(function(){
        $('#box').fadeOut('slow');
   });
  
  $('.in').click(function(){
       $('#box').fadeIn('slow');
  });
  
   $('.toggle').click(function(){
       $('#box').fadeToggle('slow');
  });
  
   $('.to').click(function(){
       $('#box').fadeTo('slow',0.33);   //透明度0-1之间
  });


});