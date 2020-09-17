package section_20_funcional_calculo_lambda;

import java.util.Arrays;

public class ProgramaFuncionaCalculo {

    private static Integer globalValue = 3;

    public static void main(String[] args) {

        Integer[] vector = new Integer[]{3, 4, 5};
        numerosPares(vector);
        System.out.println(Arrays.toString(vector));

    }

    public static void numerosPares(Integer[] param) {
        for (int i = 0; i < param.length; i++) {
            if (param[i] % 2 != 0) {
                param[i] += globalValue;
            }
        }
    }
}
