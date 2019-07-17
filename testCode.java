class BigDec implements Comparator<String> 
      	{
      	   @Override
      	    public int compare(String a, String b) 
      	    {
      		   if (a == null || b == null) 
      		  {
     		      return 0;
     		  }
			  else
			  {
      	      return (new BigDecimal(b)).compareTo(new BigDecimal(a));
			  }
      	    }
      	}
      	Arrays.sort(s, new BigDec());