@groovy.transform.ToString()
class Tweet {

    String username // @handlers
    String text
    Integer retweets
    Integer favorites
    Date  createdOn

    // Setup a constructure to define a way to create a new tweet 
    public Tweet(String user, String tweet) {
       username = user
       text = tweet
       retweets = 0
       favorites = 0
       createdOn = new Date()
    }
    
    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}


// Genrally in java we need to keep same name of file as class name ( Tweet.java ), 
// However in groovy its not required that's why we can keep class & script in the samefile. 

def tweet = new Tweet("amitvashist","Hello, Class and Script form a Samplefile!")
tweet.addToFavorites()
println tweet