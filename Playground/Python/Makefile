dev-install:
	pip install -r requirements-dev.txt

run:
	$f/local_run.sh $f

test:
	ptw -c $f
#> make test f=3.7/Hackerrank/Graphs

install-virtualenv-env:
	pyenv install $v
	pyenv virtualenv $v $e
	pyenv activate $e
#> make install-virtualenv-env v=3.9.4 e=hackerrank

