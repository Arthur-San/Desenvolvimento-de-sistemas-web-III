function validacao(){
    if(document.form.nome.value ==""){
        alert('Por favor, preecha o campo nome');
        document.form.nome.focus();
        return false;
    }
}