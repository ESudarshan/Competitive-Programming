class Trie {

    private TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode('/');        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0; i<len; i++) {
            char ch = word.charAt(i);
            TrieNode tn = null;
            if(temp.children[ch - 'a'] != null) {
                tn = temp.children[ch - 'a'];
            } else {
                tn = new TrieNode(ch);
                temp.children[ch - 'a'] = tn;
            }
            tn.count++;
            if(i == len - 1) {
                tn.endsHere++;
            }
            temp = tn;
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0; i<len; i++) {
            char ch = word.charAt(i);
            if(temp.children[ch - 'a'] == null) {
                return false;
            }
            TrieNode tn = temp.children[ch - 'a'];
            temp = tn;
        }
        return temp.endsHere > 0 ? true : false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int len = prefix.length();
        TrieNode temp = root;
        for(int i=0; i<len; i++) {
            char ch = prefix.charAt(i);
            if(temp.children[ch - 'a'] == null) {
                return false;
            }
            TrieNode tn = temp.children[ch - 'a'];
            temp = tn;
        }
        return temp.count > 0 ? true : false; 
    }
}

class TrieNode {
    
    char val;
    int endsHere;
    int count;
    TrieNode[] children;
    
    public TrieNode(char val) {
        this.val = val;
        this.endsHere = 0;
        this.count = 0;
        this.children = new TrieNode[26];
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
 */