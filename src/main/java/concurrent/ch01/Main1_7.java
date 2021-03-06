package concurrent.ch01;

import java.util.Date;

public class Main1_7 {
		public static void main(String[] args) {
			DataSourcesLoader dsLoader = new DataSourcesLoader();
			Thread thread1 = new Thread(dsLoader,"DatasourcesThread");
			NetWorkConnectionsLoader ncLoader = new NetWorkConnectionsLoader();
			Thread thread2 = new Thread(ncLoader,"NetWorkConnectionsThread");
			thread1.start();
			thread2.start();
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("Main: COnfiguration has been loaded:%s\n",new Date());
		}
}
