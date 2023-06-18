# Contributors
### Praticando encapsulamento, Herança e Polimorfismo em Java
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde.
Os dados de pessoa jurídica são nome, renda anual e número de funcionários. 

As regras para cálculo de imposto são as seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: 
(50000 * 25%) - (2000 * 50%) = 11500.00

Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00

### Demonstrativo das classes e suas ligações:
![image](https://github.com/JhoneRodrigues/OrderSummary/assets/129993748/0f87d883-0790-46a7-ade3-83323fc5ac8b)

### Em execução:
![image](https://github.com/JhoneRodrigues/OrderSummary/assets/129993748/3ea4673b-c0ff-4958-8d72-7fe41f103ec3)

## Tecnologias utilizadas
<ul>
  <li>Java</li>
</ul>

## Autor
<p>Jhone Costa Rodrigues</p>
<section align="left">  
  <div> 
    <a href = "mailto:jhonecosta30@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank" title="E-mail: jhonecosta30@gmail.com"></a>
      &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="https://www.linkedin.com/in/jhone-costa-rodrigues-79a080234/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank" title="Linkedin: Jhone Costa Rodrigues"></a>
      &nbsp;&nbsp;&nbsp;&nbsp;
     <a href="https://www.instagram.com/jhone.rodriguess/" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank" title="Instagram: jhone.rodriguess"></a>
  </div>
</section>
