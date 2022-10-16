// Time: Ao infinito e alem
// Universidade: Centro Federal de Educacao Tecnologica de Minas Gerais

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	char cor[100];
	
	scanf("%s", cor);
	
	if (strcmp(cor, "amarela")==0 || strcmp(cor, "vermelha")==0 || strcmp(cor, "azul")==0) {
		printf("primaria\n");
	} else if (strcmp(cor, "laranja")==0 || strcmp(cor, "verde")==0 || strcmp(cor, "roxa")==0) {
		printf("secundaria\n");
	} else {
		printf("outra\n");
	}

	return 0;
}
