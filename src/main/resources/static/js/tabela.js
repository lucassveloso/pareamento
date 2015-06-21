$('checked').click(function(){
	if( $('.check:checked').length == 1 ){
		var val = new Array();
		
		$('.check:checked').each(function(){
			val.push($(this).val());
			
		});

          alert(val);
		/*$.ajax({
			url:'teste.php',
			type:'POST',
			data:'valor=' + val,
			success:function(data){
				$('.exibe').html(data);
			}
		});*/
	}
	return false;
});

function manter(){
var hidden = document.getElementById("aluno0");
hidden.innerHTML = teste;
}