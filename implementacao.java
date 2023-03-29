
public class implementacao<T> implements interfacedados<T>
{
    

    protected Object nomes[];
    protected int topo = -1;

    public implementacao(int cap)
    {
        nomes = new Object[cap];
    }

    public int tamanho() 
    {
        return topo + 1;
    }

    public boolean isEmpty()
    {
        if (topo < 0)
        {
            return true;
        }
        else 
        {
            return false; 
        }
     
    }


    public String topo()
    {
        return nomes[topo].toString();   
    }

    public void colocar(String element)
    {
        nomes[++topo] = element; 
    }

    public String tirar()
    {
        try
        {
        String elementoremovido = nomes[topo].toString();
        nomes[topo] = null;
        topo--;
        return elementoremovido;
        }
        catch (Exception e)
        {
            System.out.print("LISTA ESTÁ VAZIA! ESTA OPERAÇÃO NÃO PODE SER EXECUTADA");
            return " ";
        }

    }

@Override

    public String toString() 
    {
        String s;
        s = "[";
        if (tamanho() > 0) s+= nomes[0];
        if (tamanho() > 1)
        
        for (int i = 1; i <= tamanho()-1; i++) 
        {
        s += ", " + nomes[i];
        }
        return s + "]";
    }
}
