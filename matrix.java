public class matrix{
  public double[][] twod;
  public int r;
  public int c;
  
  public matrix(){
    r=0;
    c=0;
  }
  public matrix(int rows, int columns){
    r=rows;
    c=columns;
    twod=new double[r][c];
  }
  
  public matrix(double[][] mat){
    twod=mat;
    r=mat.length;
    c=mat[0].length;
  }
  
  public String toStr(){
    String result="";
    for(int i=0;i<r;i++){
      for(int x=0;x<c;x++){
        result+=String.valueOf(twod[i][x]);
        if(x!=c-1){
          result+=",";
        }
        
      }
      result +="\n";  
    }
    return result;
  }
  
  public void switchrs(int i, int j) {
    if(i<r &&j<c){
      double[] firs=twod[i];
      double[] second=twod[j];
      twod[i]= second;
      twod[j]= firs;
    }
  }
  public double[] multrow(double k, double[]ar){
    for (int i=0;i<ar.length;++i){
      double scaled=k*ar[i];
      ar[i]=scaled;
    }
    return ar;
  }
  public void scalers(double k, int m) {
    if(m<r&&k!=0){
      double[] ary=multrow(k,twod[m]);
      twod[m]=ary;
    }
  }
  public void combo(double k, int m,int n) {
    if(m<r&&k!=0&&n<c){
      double[] added=twod[m];
      double[] ary= multrow(k,added);
      for(int i=0;i<c;++i){
        double add=twod[n][i]+ary[i];
        twod[n][i]=add;
      }
    }
  }

}