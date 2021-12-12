import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Spread Java Developer");
        curso1.setDescricao("Olá Dev, chegou o momento de você se tornar ainda mais potente para o mercado! " +
                "\nCom o Bootcamp Spread Java Developer, você aprenderá sobre os principais fundamentos de Java e " +
                "\nse especializará dentro desta área. Se inscreva agora, aprimore os seus domínios e " +
                "\ntenha chances de contratação!");
        curso1.setCargaHoraria(97);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria #1: Aula inaugural Spread Java Developer");
        mentoria.setDescricao("Aula inaugural tem a função de dar boas vindas aos Devs inscritos no bootcamp.");
        mentoria.setData(LocalDate.of(2021,11,10));

        System.out.println(curso1);
        System.out.println(mentoria);

    }
}
