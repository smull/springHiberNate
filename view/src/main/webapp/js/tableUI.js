$(document).ready(function() {

    $("#nextStep1").click(function() {
        $("#form2").show();
    });

    $("#previous").click(function() {
        $("#form2").hide();
    });

    $("#nextStep2").click(function() {

        var user = {};
        user.name = $("#name").val();
        user.lastName = $("#lastName").val();
        user.pid = $("#pid").val();
        $("#formStep3").show();
        console.log("22222");
        $.ajax({
          url:"/user/save",
          type: "POST",
          contentType:"application/json; charset=utf-8",
          dataType: 'json',
          data: JSON.stringify(user),
          success: function(data){
              console.log(data.name);
              console.log(data.lastName);
              console.log(data.pid);
                $('#form3').html('');
                console.log("3333");
                for (var i = 0; i < data.length; i++) {
                    var tr = "<tr id=" + data[i]["name"] + ">";
                    var td1 = "<td id='name'>" + data[i]["name"] + "</td>";
                    var td2 = "<td id='lastName'>" + data[i]["lastName"] + "</td>";
                    var td3 = "<td id='pid'>" + data[i]["pid"] + "</td>";
                    $("#form3").append(tr + td1 + td2 + td3);
                }

          }
        });

    });



});