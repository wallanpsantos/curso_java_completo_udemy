package section_13_usandoStringBuilder.application;

import section_13_usandoStringBuilder.entities.Comentarios;
import section_13_usandoStringBuilder.entities.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentarios comentarios1 = new Comentarios("Quero conhecer a Disney");
        Comentarios comentarios2 = new Comentarios("Viajar para o Caribe");

        Postagem postagem = new Postagem(
                simpleDateFormat.parse("10/01/2025 10:00:00"),
                "Viajar o mundo",
                "Utilizar o passaporte", 12
        );
        postagem.adicionarComentario(comentarios1);
        postagem.adicionarComentario(comentarios2);

        System.out.println(postagem);
    }
}
