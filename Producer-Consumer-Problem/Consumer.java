class Consumer extends Thread{
	private Company c;
	Consumer(Company c)
	{
		this.c=c;
	}

	public void run()
	{
		while(true)
		{
			this.c.consume_item();
			try
			{Thread.sleep(2000);}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

