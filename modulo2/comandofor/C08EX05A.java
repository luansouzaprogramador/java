// Luan Marcelino de Souza
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX05A {
	public static void main(String[] args) {
		String vencedor="", votoStr;
		int voto, luan=0, taissa=0, sophia=0, votosNulos=0, votosValidos=0;
		
		JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN, 2 para TAISSA ou 3 para SOPHIA.",
				"Eleição", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=5; i++) {
			votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
			voto = Integer.valueOf(votoStr);
			
			switch (voto) {
				case 1:
					luan++;
					votosValidos++;
					break;
				case 2:
					taissa++;
					votosValidos++;
					break;
				case 3:
					sophia++;
					votosValidos++;
					break;
				default:
					votosNulos++;
			}
		}
		
		if (votosNulos>votosValidos) {
			JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou a quantidade de votos válidos.",
					"Resultado da Eleição | 1° Turno", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			if ((luan==taissa && taissa==sophia && luan>0) || (luan==taissa && luan>sophia) || (luan==sophia && luan>taissa) || (taissa==sophia && taissa>luan)) {
				if (luan==taissa && taissa==sophia && luan>0) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN, 2 para TAISSA ou 3 para SOPHIA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else if (luan==taissa && luan>sophia) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 LUAN ou 2 para TAISSA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else if (luan==sophia && luan>taissa) {
					JOptionPane.showMessageDialog(null, "A seguir, digite 1 para LUAN ou 3 SOPHIA.",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "A seguir, digite 2 para TAISSA ou 3 para SOPHIA",
							"Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
				}
				
				if (luan==taissa && taissa==sophia && luan>0) {
					votosNulos=0;
					votosValidos=0;
					luan=0;
					taissa=0;
					sophia=0;
					for (int i=0; i<5; i++) {
						votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
						voto = Integer.valueOf(votoStr);
						switch (voto) {
						case 1:
							luan++;
							votosValidos++;
							break;
						case 2:
							taissa++;
							votosValidos++;
							break;
						case 3:
							sophia++;
							votosValidos++;
							break;
						default:
							votosNulos++;
							break;
						}
					}
					
					if (votosNulos>votosValidos) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou"+
								" a quantidade de votos válidos.", "Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else if (luan==taissa && taissa==sophia && luan>0) {
							JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois houve empate no 2° turno.",
									"Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else {
						if (luan>taissa && luan>sophia) {
							vencedor = "LUAN";
						}
						if (taissa>luan && taissa>sophia) {
							vencedor = "TAISSA";
						}
						if (sophia>luan && sophia>taissa) {
							vencedor = "SOPHIA";
						}
						
						JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
								"\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", luan, taissa, sophia, vencedor),
								"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (luan==taissa && luan>sophia) {
					votosNulos=0;
					votosValidos=0;
					luan=0;
					taissa=0;
					for (int i=0; i<5; i++) {
						votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
						voto = Integer.valueOf(votoStr);
						switch (voto) {
						case 1:
							luan++;
							votosValidos++;
							break;
						case 2:
							taissa++;
							votosValidos++;
							break;
						default:
							votosNulos++;
							break;
						}
						
					}
					
					if (votosNulos>votosValidos) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou"+
								" a quantidade de votos válidos.", "Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else if (luan==taissa) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois houve empate no 2° turno.",
								"Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else {
						if (luan>taissa) {
							vencedor = "Luan";
						} else {
							vencedor = "Taissa";
						}
						
						JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
								"\nTAISSA = %d\n\nVencedor = %s", luan, taissa, vencedor),
								"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (luan==sophia && luan>taissa) {
					votosNulos=0;
					votosValidos=0;
					luan=0;
					sophia=0;
					for (int i=0; i<5; i++) {
						votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
						voto = Integer.valueOf(votoStr);
						switch (voto) {
						case 1:
							luan++;
							votosValidos++;
							break;
						case 3:
							sophia++;
							votosValidos++;
							break;
						default:
							votosNulos++;
							break;
						}
					}
					
					if (votosNulos>votosValidos) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou"+
								" a quantidade de votos válidos.", "Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else if (luan==sophia) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois houve empate no 2° turno.",
								"Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else {
						if (luan>sophia) {
							vencedor = "Luan";
						} else {
							vencedor = "Sophia";
						}
						
						JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
								"\nSOPHIA = %d\n\nVencedor = %s", luan, sophia, vencedor),
								"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					votosNulos=0;
					votosValidos=0;
					taissa=0;
					sophia=0;
					for (int i=0; i<5; i++) {
						votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"ª pessoa votando", JOptionPane.QUESTION_MESSAGE);
						voto = Integer.valueOf(votoStr);
						switch (voto) {
						case 2:
							taissa++;
							votosValidos++;
							break;
						case 3:
							sophia++;
							votosValidos++;
							break;
						default:
							votosNulos++;
							break;
						}
					}
					
					if (votosNulos>votosValidos) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois a quantidade de votos nulos superou"+
								" a quantidade de votos válidos.", "Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else if (taissa==sophia) {
						JOptionPane.showMessageDialog(null, "A eleição foi anulada, pois houve empate no 2° turno.",
								"Resultado da Eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					} else {
						if (taissa>sophia) {
							vencedor = "Taissa";
						} else {
							vencedor = "Sophia";
						}
						
						JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:"+
								"\n\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", taissa, sophia, vencedor),
								"Resultado da eleição | 2° Turno", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			else {
				if (luan>taissa && luan>sophia) {
					vencedor = "LUAN";
				}
				if (taissa>luan && taissa>sophia) {
					vencedor = "TAISSA";
				}
				if (sophia>luan && sophia>taissa) {
					vencedor = "SOPHIA";
				}
				JOptionPane.showMessageDialog(null, String.format("Quantidade de votos para cada candidato:\n\nLUAN = %d"+
						"\nTAISSA = %d\nSOPHIA = %d\n\nVencedor = %s", luan, taissa, sophia, vencedor), "Resultado da eleição | 1° Turno",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
