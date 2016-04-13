# EthicsANDvalues-Twitter
A Java Project to predict the Ethical Values (Schwartz Values) of a person on Twitter.

## Command Line Use 

1. Clone this repository in your local system by :
    
    ```sh
      git clone https://github.com/kurisutina26/EthicsANDvalues-Twitter.git
    ```
 

2. Now migrate to the folder of the repository in the terminal and run the jar file by:
       
    ```sh
       java -jar EVT.jar path to the folder      
    ```   

  For example, let /home/xyz/Desktop/tweetfolder be the directory which contains any number of files having tweets and their twitter information in the specified particular format per user for which I will provide the files in the next commit( an example of the tweet folder is also provided), then
   ```sh
       java -jar /home/xyz/Desktop/tweetfolder      
   ```   

Vola!! You are done now! You could now find a csv file named finaloutput.csv in the repository with User IDs as the first column followed by the predictions in the form of boolean value as 1 for YES and 0 for NO for each of the 10 Schwartz Values in the order:
  - Achievement
  - Benevolence
  - Conformity
  - Hedonism
  - Power
  - Security
  - Self-Direction
  - Stimulation
  - Tradition
  - Universalism
  
This is a result of a research work on Schwartz Model of Psychology and each step can be justified, so till then wait for the research paper being published.

A better interactive platform and features are more to come!!
