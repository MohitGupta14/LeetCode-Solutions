class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>();
        String arr[]=path.split("/");
       
        for(int i=0;i<arr.length;i++){
            if(arr[i].isEmpty()){
                continue;
            }
            if(arr[i].equals("..") && !stack.empty() ){
                stack.pop();
            }else if(!arr[i].equals("..") && !arr[i].equals(".")){
                stack.push(arr[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}