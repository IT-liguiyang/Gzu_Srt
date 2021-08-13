window.addEventListener('load', function() {
    //topnav下拉菜单
    $(function() {
        // 鼠标经过
        $(".g-rom .clearfix .top_my").mouseover(function() {
            // { "background-image": "url(images/up.png)", "border-left": "1px solid #999", "border-right": "1px solid #999" }
            $(".g-rom .clearfix .top_my").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });

        $(".g-rom .clearfix .top_service").mouseover(function() {
            $(".g-rom .clearfix .top_service").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".g-rom .clearfix .top_iphone").mouseover(function() {
            $(".g-rom .clearfix .top_iphone").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".g-rom .clearfix .top_weixin").mouseover(function() {
            $(".g-rom .clearfix .top_weixin").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });
        $(".g-rom .clearfix .top_nav").mouseover(function() {
            $(".g-rom .clearfix .top_nav").css("background-image", "url(images/up.png)");
            $(this).children(".menu").show();
        });

        // 鼠标离开
        $(" .clearfix>dd").mouseout(function() {
            $(".g-rom .clearfix dd").css("background-image", "url(images/down.png)");
            $(this).children(".menu").hide();
        });
    });
});