package CalcMatrices;

public class Matriz {
    private Integer NumerodeFilas=0;
    private Integer NumerodeColumnas=0;
    private float[][] Datos;
    
    public Matriz(Integer inFilas, Integer inColumnas)
    {
        super();
        NumerodeFilas=inFilas;
        NumerodeColumnas=inColumnas;
        Datos = new float[NumerodeFilas][NumerodeColumnas];
    }


    public Integer getNumerodeFilas() {
        return NumerodeFilas;
    }

    public Integer getNumerodeColumnas() {
        return NumerodeColumnas;
    }

    public float[][] getDatos() {
        return Datos;
    }

    public float getElemento(Integer I, Integer J)
    {
        return Datos[I][J];
    }
    
    public void setElemento(float valor, Integer I, Integer J)
    {
        Datos[I][J]=valor;
    }
}
