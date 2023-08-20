package candidate;

import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) {
        printSelected();
    }

    static void printSelected () {
        String[] candidates = {"Felipe", "Mateus", "Mariana", "Bruno", "Davie"};

        for (String candidate: candidates) {
            System.out.println("O candidato selecionado foi: " + candidate);
        }
    }

    static void cadidateSelection() {
        String[] candidates = {"Felipe", "Mateus", "Mariana", "Bruno", "Davie", "Gabriel"};

        int candidateSelecitions = 0;
        int candidateActual = 0;
        double salaryBase = 2000.0;

        while (candidateSelecitions < 5 && candidateActual < candidates.length) {
            String candidate = candidates[candidateActual];
            double salaryRequired = valueRequired();
            System.out.println("O candidato " + candidate + " Solicitou este valor " + salaryRequired);

            if (salaryBase >= salaryRequired) {
                System.out.println("O candidato " + candidate + " foi selecionado");
                candidateSelecitions++;
            }
            candidateActual++;
        }
    }

    static double valueRequired() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeCandidate(double intendedSalary) {
        double salaryBase = 2000.0;
        if (salaryBase > intendedSalary) {
            System.out.println("call the candidate");
        } else if (salaryBase == intendedSalary) {
            System.out.println("call the candidate with a counter proposal");
        } else {
            System.out.println("waiting for candidates");
        }
    }
}
