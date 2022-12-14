//prime
// even or odd
//sum of n numbers
import Foundation

print("Enter A Number :")
var n = readLine()  //accepting Input From Key =Borad As a String

let num = Int(n!) // storing String Type Number to Integer Type

print(" 1.Prime ")
print(" 2.Even/Odd ")
print(" 3.Sum Of N Numbers ")
var ch = readLine()
let choice = Int(ch!)
func prime(numb : Int) -> Int {
    
    if(numb % 2 == 0){ return 0 }
    else {return 1}
}

func even(numb : Int) -> Int {
    //if num divided by 2 == 0 then return 1 [Even] else Odd
    if(numb % 2 == 0){return 1}
    else {return 0}
}

func sumofnum(numb : Int) -> Int {
    
    var res = 0
    for i in 0..<numb+1
    {
        res += i
        
    }
            return res
}

  switch(choice!){
    
  case 1 : let res = prime(numb: num!)
      if res == 0 {print("not a Prime Number")}
      else {print("Its A Prime Number")}
      
  case 2 : let res = even(numb: num!)
      if(res == 0){print("odd Number")}
      else{print("even Number")}
//            print(res)
      
  case 3 : var res = sumofnum(numb: num!)
            print(res)
      
  default : print("default")
      
 }

// Classs And Function

class Add{
        func addresult(){
            print("enter A value")
            let a = readLine()
            print("enter B value")
            let b = readLine()
            
            let x = Int(a!)
            let y = Int(b!)
            print(x! + y!)
        }
        
    
}

let res = Add()
let res1 = res.addresult()

//multliple class 

import Foundation

class Car{
    let speed = 200
    func carspeed()
    {
        print("top speed at \(speed)")
    }
}
class Brands{
    
    let speed = 120
    func audi(){

        print("Audi Q7 Top Speed \(speed)")
    }
    
    let speed1 = 700
    func emerits(){
        
        print("Emeriates speed \(speed1)")
        
    }
}
let res = Car()
let brnd = Brands()

brnd.audi()
brnd.emerits()
//print(res.speed)
res.carspeed()
//class and object

import Foundation

class A
{
    var speed = 300
    var sp = 190
    func drive()
    {
        print("riding at speed of ", speed)
    }
    
}
//
//

class B : A{
    
    func cars()
    {
        print("car speed is :" , speed)
        
    }
    
}


class C : B{
    
    func flys()
    {
        print("plane speed is :" , speed)
        
    }
    
}


 var cobj = C()
cobj.flys()
cobj.drive()
cobj.cars()

  


