package math.problems;

import databases.ConnectToSqlDB;

import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
			int n=100,k=0;
			int status = 1;
			int num = 3;
			int []dbArray=new int[n];

			if (n >= 1)
			{
				System.out.println("First "+n+" prime numbers are:");
				//2 is a known prime number
				System.out.print(2+" ");
				dbArray[k]=2;
				k++;
			}

			for ( int i = 2 ; i <=n ;  )
			{
				for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
				{
					if ( num%j == 0 )
					{
						status = 0;
						break;
					}
				}
				if ( status != 0 )
				{
					System.out.print(num+" ");
						dbArray[k]=num;
						k++;

					i++;
				}
				status = 1;
				num++;
			}

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromArrayToSqlTable(dbArray, "PrimeNumber", "Numbers");
		List<String> numbers = connectToSqlDB.readDataBase("PrimeNumber", "Numbers");

	}

}
