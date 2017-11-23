#include<stdio.h>
int book[501], n;
bool cover(int range, int k, int pivot)
{
	int count = 1, page = 0;
	for (int i = pivot; i <= n; i++)
		if (book[i] <= range)
		{
			if (page + book[i] <= range)
				page += book[i];
			else
			{
				count++;
				page = book[i];
				if (count > k)
					return false;
			}
		}
		else
			return false;
	return true;
}
int main()
{
	int t, k;
	scanf("%d", &t);
	while (t--)
	{
		int max = 0, sum = 0;
		scanf("%d%d", &n, &k);
		for (int i = 1; i <= n; i++)
		{
			scanf("%d", &book[i]);
			sum += book[i];
		}
		while (max < sum)
		{
			int m = (max + sum) >> 1;
			if (cover(m, k, 1))
				sum = m;
			else
				max = m + 1;
		}
		for (int i = 1, j = 1; i <= k; i++)
		{
			if (i < k)
			{
				int cur = book[j];
				printf("%d ", book[j++]);
				while (j <= n && (cur += book[j]) <= max && !cover(max, k - i, j))
					printf("%d ", book[j++]);
				printf("/ ");
			}
			else
				while (j <= n)
					printf("%d ", book[j++]);
		}
		puts("");
	}
	return 0;
}