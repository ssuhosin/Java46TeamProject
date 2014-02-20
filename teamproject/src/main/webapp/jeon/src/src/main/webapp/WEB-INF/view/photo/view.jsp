<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Thumbnail scroller jQuery plugin</title>
<style type="text/css">
</style>
<!-- thumbnail scroller stylesheet -->
<link href="jquery.thumbnailScroller.css" rel="stylesheet" />
<!-- jquery -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<!-- jquery ui custom build (for animation easing) -->
<script src="jquery-ui-1.8.13.custom.min.js"></script>
</head>
<body>
<!-- info -->
<!-- thumbnail scroller markup begin -->
<div id="tS1" class="jThumbnailScroller" style="margin-top:160px; width:95%;">
  <div class="jTscrollerContainer">
    <div class="jTscroller">
      <c:forEach var="p" items="${photos}">
        <a href="#"><img src="${pageContext.request.contextPath}/files/${p.path}"></a>
      </c:forEach> 
    </div>
  </div>
  <a href="#" class="jTscrollerPrevButton"></a>
  <a href="#" class="jTscrollerNextButton"></a>
</div>

<!-- thumbnail scroller markup end -->
<script>
/* jQuery.noConflict() for using the plugin along with other libraries. 
   You can remove it if you won't use other libraries (e.g. prototype, scriptaculous etc.) or 
   if you include jQuery before other libraries in yourdocument's head tag. 
   [more info: http://docs.jquery.com/Using_jQuery_with_Other_Libraries] */
jQuery.noConflict(); 
/* calling thumbnailScroller function with options as parameters */
(function($){
window.onload=function(){
  $("#tS1").thumbnailScroller({ 
    scrollerType:"hoverAccelerate", 
    scrollerOrientation:"horizontal", 
    scrollSpeed:2, 
    scrollEasing:"easeOutCirc", 
    scrollEasingAmount:600, 
    acceleration:4, 
    scrollSpeed:800, 
    noScrollCenterSpace:10, 
    autoScrolling:0, 
    autoScrollingSpeed:2000, 
    autoScrollingEasing:"easeInOutQuad", 
    autoScrollingDelay:500 
  });
}
})(jQuery);
</script>
<!-- thumbnailScroller script -->
<script src="jquery.thumbnailScroller.js"></script>
</body>
</html>
