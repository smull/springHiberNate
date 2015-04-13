$(document).ready(function(){

    console.log("222");
    $("#deleteCateg").click(function(){
        var dataCategory = $( "select option:selected" ).val();
        $.ajax({
            url:"/product/deleteCategory?nameCategory= " +dataCategory,
            contentType: "application/json; charset=utf-8",
            //data : JSON.stringify(dataCategory),
            success: function(data){

            }
        });


        //$.getJSON("demo_ajax_json.js", function(result){
        //    $.each(result, function(i, field){
        //        $("div").append(field + " ");
        //    });
        //});
    });




});

