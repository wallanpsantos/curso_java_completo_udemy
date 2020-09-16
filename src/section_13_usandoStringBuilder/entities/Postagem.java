package section_13_usandoStringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    private List<Comentarios> listaComentarios = new ArrayList<>();

    public Postagem(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentarios> getListaComentarios() {
        return listaComentarios;
    }

    public void adicionarComentario(Comentarios comentarios) {
        listaComentarios.add(comentarios);
    }

    public void remocerComentario(Comentarios comentarios) {
        listaComentarios.remove(comentarios);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        stringBuilder.append("Titulo do Post: " + titulo);
        stringBuilder.append("\n" + curtidas + " curtidas");
        stringBuilder.append(" - " + simpleDateFormat.format(momento));
        stringBuilder.append("\n" + "Conteudo: " + conteudo);
        stringBuilder.append("\n" + "Comentarios: ");
        for (Comentarios comentarios : listaComentarios) {
            stringBuilder.append(comentarios.getTexto()).append(", ");
        }
        return stringBuilder.toString();
    }
}
