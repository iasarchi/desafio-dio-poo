package domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descreicao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descreicao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIasmim = new Dev();
        devIasmim.setNome("Iasmim");
        devIasmim.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos iasmim"+devIasmim.getConteudosInscritos());

        devIasmim.progredir();

        System.out.println("conteudos concluidos iasmim"+devIasmim.getConteudosConcluidos());
        System.out.println("conteudos concluidos iasmim"+devIasmim.getConteudosConcluidos());

        Dev devJosue = new Dev();
        devJosue.setNome("Josue");
        devJosue.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos josue"+devJosue.getConteudosInscritos());

        devJosue.progredir();

        System.out.println("conteudos concluidos josue"+devJosue.getConteudosConcluidos());
        System.out.println("conteudos concluidos josue"+devJosue.getConteudosConcluidos());



    }
}

