import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fulano:" + devFulano.getConteudosConcluidos());
        System.out.println("XP:" + devFulano.calcularTotalXp());

        System.out.println("-------");

        Dev devBeltrano = new Dev();
        devBeltrano.setNome("Beltrano");
        devBeltrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Beltrano:" + devBeltrano.getConteudosInscritos());
        devBeltrano.progredir();
        devBeltrano.progredir();
        devBeltrano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Beltrano:" + devBeltrano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Beltrano:" + devBeltrano.getConteudosConcluidos());
        System.out.println("XP:" + devBeltrano.calcularTotalXp());

    }

}