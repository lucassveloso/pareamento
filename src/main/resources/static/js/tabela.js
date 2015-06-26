
var val = [];

function ListarAlunosManterHistoria() {
    var checkbox = $('input[type=checkbox]:checked');
    if(checkbox.length > 0){
        checkbox.each(function(){
            val.push($(this).val());
        });

}
        var link = "/tabela?manter=" + val;
        window.location.replace(link);

}

