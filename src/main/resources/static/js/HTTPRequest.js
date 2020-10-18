$("#userLoginBtn").on('click',()=>{ //.on 이벤트 트리거
    var data = {};
    //loginform 태그에 접근 후 직렬화 후 객체화
    $("form[name=loginform]").serializeArray().map(function(x){data[x.name] = x.value;});
    console.log(data)

    $.ajax({
        type: "POST", //fix
        dataType: "json", //fix
        contentType: "application/json; charset=utf-8;", //fix
        url: "/api/uidlogin",
        data: JSON.stringify(data), //fix ; 객체->스트링
    }).done(function(data) {
        //로직 필요에 따라 변경
        if(data.status==200){
            alert("안녕하세요, 기운팜팜입니다!")
            document.location.href = '/';
        }
        else if(data.status==400){
            alert("유저 로그인 실패! 아이디와 비밀번호를 다시 입력해주세요!")
        }
    })
})

$("#pharmLoginBtn").on('click',()=>{ //.on 이벤트 트리거
    var data = {};
    //loginform 태그에 접근 후 직렬화 후 객체화
    $("form[name=loginform]").serializeArray().map(function(x){data[x.name] = x.value;});
    console.log(data)

    $.ajax({
        type: "POST", //fix
        dataType: "json", //fix
        contentType: "application/json; charset=utf-8;", //fix
        url: "/api/pidlogin",
        data: JSON.stringify(data), //fix ; 객체->트링
    }).done(function(data) {
        //로직 필요에 따라 변경
        if(data.status==200){
            alert("약사님, 안녕하세요!")
            document.location.href = '/';
        }
        else if(data.status==400){
            alert("약사 로그인 실패! 아이디와 비밀번호를 다시 입력해주세요!")
        }
    })
})

// $("#userRegiBtn").on('click',()=>{ //.on 이벤트 트리거
//     var data = {};
//     //loginform 태그에 접근 후 직렬화 후 객체화
//     $("form[name=loginform]").serializeArray().map(function(x){data[x.name] = x.value;});
//     console.log(data)
//
//     $.ajax({
//         type: "POST", //fix
//         dataType: "json", //fix
//         contentType: "application/json; charset=utf-8;", //fix
//         url: "/api/uregi",
//         data: JSON.stringify(data), //fix ; 객체->트링
//     }).done(function(data) {
//         //로직 필요에 따라 변경
//         if(data.status==200){
//             alert("유저 회원가입 성공! 환영합니!")
//             document.location.href = '/';
//         }
//         else if(data.status==400){
//             alert("유저 회원가입 실패! 아이디와 비밀번호를 다시 입력해주세요!")
//         }
//     })
// })


$.ajax({
    url:'/api/llocation',
    type:"GET",
    dataType:"text",
    contentType: "application/xml; charset=utf-8;",
    success:function (data){

        if(data){
            map=new kakao.maps.Map('map', mapOption);

            $(data).find('item').each(function (){
                var wgs84Lat=$(this).find("wgs84Lat").text();
                var wgs84Lon=$(this).find("wgs84Lon").text();

                marker=new kakao.maps.Marker({
                    map:map,
                    position: new kakao.maps.LatLng(wgs84Lon, wgs84Lat)
                })

            })
        }
    }
})



/*$("#btn_map").on('click',()=> {
    $.ajax({
        url: '/index',
        type: 'POST',
        dataType: 'html',
        success: function () {
            /*$(document).reday(function(){
                $('#btn_map').click(function(){
                    $(location).attr("href","location.html");
                });
            });*/

               /* document.location.href = "location";

        }
    })
})*/

/*$(function (){
    $('#btn_map').click(function (){
        location.href = 'location.html';
    });
});*/

function PageMove(){
    $("#btn_map").on('click',()=>{
        $.ajax({
            url: "/location",
            async : true,
            type : "POST",
            dataType : "html",
            cache : false
        })
    })
    /*var ajaxOption = {
        url: "/index",
        async : true,
        type : "POST",
        dataType : "html",
        cache : false
    };*/

   /* $.ajax(ajaxOption).click(function (data){
        //$('#index').children().remove();
        $('#location').html(data);
    })*/
}
