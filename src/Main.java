import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Boas-vindas ao Bootcamp Spread Java Developer");
        curso1.setDescricao("Conheça a Spread, uma empresa que acredita que boas ideias nascem de bons relacionamentos.");
        curso1.setCargaHoraria(1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria #1: Aula inaugural Spread Java Developer");
        mentoria.setDescricao("Aula inaugural tem a função de dar boas vindas aos Devs inscritos no bootcamp.");
        mentoria.setData(LocalDate.of(2021,11,10));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Spread Java Developer");
        bootcamp.setDescricao("Olá Dev, chegou o momento de você se tornar ainda mais potente para o mercado! " +
                "\nCom o Bootcamp Spread Java Developer, você aprenderá sobre os principais fundamentos de Java e se " +
                "\nespecializará dentro desta área. Se inscreva agora, aprimore os seus domínios " +
                "\ne tenha chances de contratação!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devPaula.getConteudosInscritos());
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("Conteudos concluídos: " + devPaula.getConteudosConcluidos());
        System.out.println("XP: " + devPaula.calcularTotalXp());



    }
}
