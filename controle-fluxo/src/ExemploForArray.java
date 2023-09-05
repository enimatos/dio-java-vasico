public class ExemploForArray{
    
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }


        //outra forma de resolver

        for(String aluno : alunos){
            System.out.println("O nome do(a) aluno(a) é: " + aluno);
        }
    }
}