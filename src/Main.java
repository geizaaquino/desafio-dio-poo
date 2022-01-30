import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTirulo("curso Java");
        curso1.setDescricao("Descricao do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTirulo("curso Js");
        curso2.setDescricao("Descricao do curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTirulo("mentoria de java");
        mentoria.setDescricao("duvidas em  java");
        mentoria.setData(LocalDate.now());

        out.println(curso1);
        out.println(curso2);
        out.println(mentoria);

    }
}
