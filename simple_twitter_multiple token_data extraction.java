package twitterwork;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import twitter4j.IDs;
//import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
//import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

	public class part1
	{
		public static String consumerKey1 = ;
		public static String consumerSecret1 = ;
		public static String token1 = ;
		public static String tokenSecret1 = ;
		
		public static String consumerKey2 = ;
		public static String consumerSecret2 = ;
		public static String token2 = ;
		public static String tokenSecret2 = ;
		
		public static String consumerKey3 =;
		public static String consumerSecret3 =;
		public static String token3 = ;
		public static String tokenSecret3 = ;
		
		public static String consumerKey4 = ;
		public static String consumerSecret4 =;
		public static String token4 = ;
		public static String tokenSecret4 = ;
		
		public static String consumerKey5 = "";
		public static String consumerSecret5 ="";
		public static String token5 = "";
		public static String tokenSecret5 = "";
		
		public static String consumerKey6 = ;
		public static String consumerSecret6 ="";
		public static String token6 = "";
		public static String tokenSecret6 = "";
		
		public static String consumerKey7 = "";
		public static String consumerSecret7 ="";
		public static String token7 = "";
		public static String tokenSecret7 = ;
		
		public static String consumerKey8 = "";
		public static String consumerSecret8 =;
		public static String token8 = "33TmOpmM9GQsrry";
		public static String tokenSecret8 = "AIC";
		         
		
		public static void main(String[] args) throws Exception{
			ConfigurationBuilder cb1=new ConfigurationBuilder();
			cb1.setOAuthConsumerKey(consumerKey1);
			cb1.setOAuthConsumerSecret(consumerSecret1);
			cb1.setOAuthAccessToken(token1);
			cb1.setOAuthAccessTokenSecret(tokenSecret1);
			ConfigurationBuilder cb2=new ConfigurationBuilder();
			cb2.setOAuthConsumerKey(consumerKey2);
			cb2.setOAuthConsumerSecret(consumerSecret2);
			cb2.setOAuthAccessToken(token2);
			cb2.setOAuthAccessTokenSecret(tokenSecret2);
			ConfigurationBuilder cb3=new ConfigurationBuilder();
			cb3.setOAuthConsumerKey(consumerKey3);
			cb3.setOAuthConsumerSecret(consumerSecret3);
			cb3.setOAuthAccessToken(token3);
			cb3.setOAuthAccessTokenSecret(tokenSecret3);
			
			Twitter twitter1 =new TwitterFactory(cb1.build()).getInstance();
			Twitter twitter2 =new TwitterFactory(cb2.build()).getInstance();
			Twitter twitter3=new TwitterFactory(cb3.build()).getInstance();
			
			ConfigurationBuilder cb4=new ConfigurationBuilder();
			cb4.setOAuthConsumerKey(consumerKey4);
			cb4.setOAuthConsumerSecret(consumerSecret4);
			cb4.setOAuthAccessToken(token4);
			cb4.setOAuthAccessTokenSecret(tokenSecret4);
			ConfigurationBuilder cb5=new ConfigurationBuilder();
			cb5.setOAuthConsumerKey(consumerKey5);
			cb5.setOAuthConsumerSecret(consumerSecret5);
			cb5.setOAuthAccessToken(token5);
			cb5.setOAuthAccessTokenSecret(tokenSecret5);
			ConfigurationBuilder cb6=new ConfigurationBuilder();
			cb6.setOAuthConsumerKey(consumerKey6);
			cb6.setOAuthConsumerSecret(consumerSecret6);
			cb6.setOAuthAccessToken(token6);
			cb6.setOAuthAccessTokenSecret(tokenSecret6);
			ConfigurationBuilder cb7=new ConfigurationBuilder();
			cb7.setOAuthConsumerKey(consumerKey7);
			cb7.setOAuthConsumerSecret(consumerSecret7);
			cb7.setOAuthAccessToken(token7);
			cb7.setOAuthAccessTokenSecret(tokenSecret7);
			ConfigurationBuilder cb8=new ConfigurationBuilder();
			cb8.setOAuthConsumerKey(consumerKey8);
			cb8.setOAuthConsumerSecret(consumerSecret8);
			cb8.setOAuthAccessToken(token8);
			cb8.setOAuthAccessTokenSecret(tokenSecret8);
			

			Twitter twitter4 =new TwitterFactory(cb4.build()).getInstance();
			Twitter twitter5 =new TwitterFactory(cb5.build()).getInstance();
			Twitter twitter6=new TwitterFactory(cb6.build()).getInstance();

			Twitter twitter7 =new TwitterFactory(cb7.build()).getInstance();
			Twitter twitter8 =new TwitterFactory(cb8.build()).getInstance();
			
			
			String usr="SrBachchan";      
			//User u=twitter.showUser(usr);
			PrintStream out=new PrintStream(new FileOutputStream("/home/samiksha/Documents/XXXX3.txt"));
			int w1=1,w2=1,w3=1,w4=1,w5=1,w6=1,w7=1,w8=1;
			//long id=u.getId();
			long lCursor=-1, nextCursor=-1;
			IDs followersIDs=null;
			do{
				lCursor=nextCursor;
				out.println("###"+nextCursor);
				if(w1!=16) {
				
				try{
					followersIDs=twitter6.getFollowersIDs(usr, lCursor);
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				for(long k: followersIDs.getIDs()){
					//User p=twitter.showUser(k);
					   out.println(k);
					   
					} 
				nextCursor=followersIDs.getNextCursor();
				w1++;
				}
				else if(w2!=16){
					try{
						followersIDs=twitter7.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()){
						out.println(k);
					}
					nextCursor=followersIDs.getNextCursor();
					w2++;
				}
				else if(w3!=16){
					try{
						followersIDs=twitter5.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w3++;
				}
				else if(w4!=16){
					try{
						followersIDs=twitter4.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w4++;
				}
				else if(w5!=16){
					try{
						followersIDs=twitter5.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w5++;
				}
				else if(w6!=16){
					try{
						followersIDs=twitter6.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w6++;
				}
				else if(w7!=16){
					try{
						followersIDs=twitter7.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w7++;
				}
				else if(w8!=16){
					try{
						followersIDs=twitter8.getFollowersIDs(usr, lCursor);
					}catch(Exception e){
						e.printStackTrace();
					}
					for(long k:followersIDs.getIDs()) out.println(k);
					nextCursor=followersIDs.getNextCursor();
					w8++;
				}
				else {
					try{
						TimeUnit.MINUTES.sleep(16);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					w1=1; w2=1;w3=1;w4=1;w5=1;w6=1;w7=1;w8=1;
				}
				
				
			}while(nextCursor!=0);
			
			out.flush();
			out.close();
			
		}
		
	
}
