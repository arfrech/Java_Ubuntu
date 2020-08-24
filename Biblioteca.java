public class Biblioteca{

    private String titulo;
    private String autor;
    private String ano;
    private String categoria;
    private String posE;
    private String posP;
    private String disponivel;

    public Biblioteca(String titulo, String autor, String ano, String categoria, 
    String posE, String posP, String disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.posE = posE;
        this.posP = posP;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setAno(String Ano){
        this.ano = ano;
    }
    public String getAno(){
        return ano;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }

    public void setPosE(String posE){
        this.posE = posE;
    }
    public String getPosE(){
        return posE;
    }

    public void setPosP(String posP){
        this.posP = posP;
    }
    public String getPosP(){
        return posP;
    }

    public void setDisponivel(String disponivel){
        this.disponivel = disponivel;
    }
    public String isDisponivel(){
        return disponivel;
    }

    public String exibirInfo(){
        String info = "Livro " + titulo + " by " + autor + " (" + ano + ") Estante/Prateleira: " + posE + "/" + posP;
        if(disponivel == "S"){
            info = info + " O livro esta disponivel para emprestimo.";
        }
        else{
            info = info + " Livro indisponivel.";
        }
        return info;
    }


}