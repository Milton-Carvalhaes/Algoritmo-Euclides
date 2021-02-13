#include <iostream>
using namespace std;

int euclides(int num1, int num2){
    if(num2 > num1)swap(num1, num2); 
    int endo=num1, isor=num2, auxisor;
    while(isor>0){
        auxisor = isor;
        isor=endo%isor;
        endo=auxisor;
    }
    return auxisor;
}

int main(){
    int num1, num2;
    cin >> num1;cin >> num2;
    cout << euclides(num1, num2) << endl;
}
