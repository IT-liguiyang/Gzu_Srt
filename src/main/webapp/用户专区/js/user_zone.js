window.addEventListener('load', function() {
    //topnav下拉菜单
    $(function() {
        // 鼠标经过
        $(".clearfix .top_my").mouseover(function() {
            // { "background-image": "url(images/up.png)", "border-left": "1px solid #999", "border-right": "1px solid #999" }
            $(".clearfix .top_my").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });

        $(".clearfix .top_service").mouseover(function() {
            $(".clearfix .top_service").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".clearfix .top_iphone").mouseover(function() {
            $(".clearfix .top_iphone").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".clearfix .top_weixin").mouseover(function() {
            $(".clearfix .top_weixin").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".clearfix .top_nav").mouseover(function() {
            $(".clearfix .top_nav").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });

        // 鼠标离开
        $(".clearfix>dd").mouseout(function() {
            $(".clearfix dd").css("background-image", "url(images/down.png)");
            $(this).children(".menu").hide();
        });
    });

    //tab栏切换
    $(function() {
        // 1.点击上部的li，当前li 添加current类，其余兄弟移除类
        $(".tab_list li").click(function() {
            // 链式编程操作
            $(this).addClass("current").siblings().removeClass("current");
            // 2.点击的同时，得到当前li 的索引号
            var index = $(this).index();
            console.log(index);
            // 3.让下部里面相应索引号的item显示，其余的item隐藏
            $(".tab_con .item").eq(index).show().siblings().hide();
        });
    })
});