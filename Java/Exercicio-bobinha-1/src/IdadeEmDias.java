import java.time.DateTimeException;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua data de nascimento em (dd/MM/yyyy): ");
        String dataNascimentoStr = entrada.nextLine();

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    try{
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatarData);
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        System.out.print("Sua idade é " +
                periodo.getYears() + " anos, " +
                periodo.getMonths() + " meses e " +
                periodo.getDays() + " dias.");
    } catch (DateTimeException e) {
        System.out.print("\nFormato de data inválido. Use o formato (dd/MM/yyyy).\n");
    }
    entrada.close();


    }

}
