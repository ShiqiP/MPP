package prob4;

@FunctionalInterface
public interface TriFunction <S,T,U,R> {
R apply(S input1, T input2, U input3);
}
