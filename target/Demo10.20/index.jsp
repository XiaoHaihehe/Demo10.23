<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    var page=1;
    var row=5;
    var MaxPage=1;
    $(function(){
        showAll();
        $("#firstP").click(function(){
            page=1;
            showAll();
        })
        $("#lastone").click(function(){
            page=MaxPage;
            showAll();
        })
        $("#lastP").click(function(){
            page--;
            if(page<1){
                page=1;
            }
            showAll();
        })
        $("#nextP").click(function(){
            page++;
            if(page>MaxPage){
                page=MaxPage;
            }
            showAll();
        })
        $("#pageB").click(function(){
            page=$("#pageT").val();
            showAll();
        })
        $("#rowB").click(function(){
            row=$("#rowT").val();
            showAll();
        })
    })
    function showAll(){
        $.getJSON("findMaxPage.do?page="+page+"&row="+row,function(msg){
            $("#a2").text(page+"/"+msg)
        })
        $.getJSON("SelectAll.do?page="+page+"&row="+row,function(msg){
            page=msg.page;
            row=msg.row;
            MaxPage=msg.maxPage;
            var list = msg.pageList;
            var table="<table border='1px red solid'  align = center>"
                +"<tr bgcolor = 'aqua'>"
                +"<td>tno</td>"
                +"<td>NAME</td>"
                +"<td>sex</td>"
                +"<td>birthday</td>"
                +"<td>prof</td>"
                +"<td>depart</td>"
                +"</tr>"
            for(var i = 0;i<list.length;i++){
                table+="<tr style=' line-height : 50px;'>"
                    +"<td>"
                    +"<a>"+list[i].tno+"</a>"
                    +"</td>"
                    +"<td>"
                    +"<a>"+list[i].name+"</a>"
                    +"</td>"
                    +"<td>"
                    +"<a>"+list[i].sex+"</a>"
                    +"</td>"
                    +"<td>"
                    +"<a>"+list[i].birthday+"</a>"
                    +"</td>"
                    +"<td>"
                    +"<a>"+list[i].prof+"</a>"
                    +"</td>"
                    +"<td>"
                    +"<a>"+list[i].depart+"</a>"
                    +"</td>"
                    +"</tr>"
                    +"<tr>"
            }
            table+="</table>"
            $("#d").html(table);
        })
    }
</script>
<body>
<div id="d"></div>
<table border="1px red solid" align = center>
    <tr bgcolor="aqua">
        <td colspan = 7 align = center>
            <input type="button" value="首页" id="firstP">
            <input type="button" value="上一页" id="lastP">
            <a id="a2"></a>
            <input type="button" value="下一页" id="nextP">
            <input type="button" value="尾页" id="lastone">
            <input type = "text" id="pageT" name = "page">
            <input type = "button" id="pageB" value="跳转">
            <input type = "text" id="rowT" name = "row">
            <input type = "button" id="rowB" value="设置">
        </td>
    </tr>
</table>
</body>
</html>