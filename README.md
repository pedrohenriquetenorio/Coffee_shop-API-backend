# Coffee_shop-API-backend

O sistema coffee.io é um sistema de gerenciamento comercial, desenvolvido para uma empresa fictícia. 
O sistema dispõe de dois níveis de acesso por meio de um login, permite o controle de acesso a páginas e o registro atividade no site. 
O primeiro nível é para gerentes e administradores, que por sua vez, tem o acesso total ao sistema, efetua as tarefas de controle (cadastro, exclusão, alteração, consulta) de vendas, caixa, compra e estoque. Cabe também a este nível de acesso a inclusão de funcionários e produtos e fornecedores no sistema.
O segundo nível de acesso é dos funcionários, terão acesso parcial ao sistema, podendo efetuar venda, abertura e fechamento de caixa e reposição do estoque.
A página de vendas permite a saída de produtos, o funcionário deve selecionar os produtos que serão preparados e o sistema calcula os valores, permitindo também o cálculo de descontos, por fim é impresso um cupom incluindo a senha do cliente.
A página de compra serve para registro de pedidos feitos a fornecedores, o pedido fica registrado com o status em aberto até a entrega dos produtos, este status pode alterar para requer atenção e fechado, após adição dos produtos no estoque, o pedido fica salvo no histórico de pedidos.
A página de estoque permite a entrada de ingredientes de produtos, o funcionário deve selecionar o pedido e os produtos que serão adicionados no sistema.
O controle de produto é feito pelos gerentes e administradores, o sistema permite que funcionários consulte os mesmos.
O controle de caixa é feito por todos da empresa, mantendo o acesso restrito para funcionários das páginas de histórico de caixa, toda movimentação de caixa é registrada.
