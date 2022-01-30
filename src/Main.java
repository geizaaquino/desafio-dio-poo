import br.com.dio.desafio.dominio.*;

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


//        out.println(curso1);
//        out.println(curso2);
//        out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAntonia = new Dev();
        devAntonia.setNome("Antonia");
        devAntonia.inscreverBootcamp(bootcamp);
        out.println("Conteudos inscritos Antonia"+ devAntonia.getConteudosInscritos());
        devAntonia.progredir();
        devAntonia.progredir();
        out.println("-");
        out.println("Conteudos inscritos Antonia"+ devAntonia.getConteudosInscritos());
        out.println("Conteudos Concluidos Antonia"+ devAntonia.getConteudosConcluidos());
        out.println("XP" + devAntonia.calcularTotalXp());

        out.println("**************************");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        out.println("-");
        out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        out.println("Conteudos concluidos Camila"+ devAntonia.getConteudosConcluidos());
        out.println("XP" + devCamila.calcularTotalXp());


    }
}
